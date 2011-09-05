/*
 * Copyright (C) 2009 Stijn Cole
 * Copyright (C) 2010-2011 Richard Lincoln
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package be.kuleuven.esat.electa.jdyn;

import cern.colt.matrix.tdcomplex.DComplexFactory1D;
import cern.colt.matrix.tdcomplex.DComplexMatrix1D;
import cern.colt.matrix.tdcomplex.DComplexMatrix2D;
//import cern.colt.matrix.tdcomplex.algo.SparseDComplexAlgebra;
//import cern.colt.matrix.tdcomplex.algo.decomposition.SparseDComplexLUDecomposition;
import cern.colt.matrix.tdouble.DoubleMatrix1D;
import cern.colt.util.tdouble.Util;
import cern.jet.math.tdcomplex.DComplexFunctions;
import edu.cornell.pserc.jpower.jpc.Branch;
import edu.cornell.pserc.jpower.jpc.Bus;
import edu.cornell.pserc.jpower.pf.Djp_makeYbus;

/**
 * Constructs augmented bus admittance matrix Ybus
 *
 * @author Stijn Cole
 * @author Richard Lincoln
 *
 */
public class Djd_AugYbus {

	private static final DComplexFunctions cfunc = DComplexFunctions.functions;

	/**
	 *
	 * @param baseMVA power base
	 * @param bus bus data
	 * @param branch branch data
	 * @param xd_tr d component of transient reactance
	 * @param gbus generator buses
	 * @param P load active power
	 * @param Q load reactive power
	 * @param U0 steady-state bus voltages
	 * @return factorised augmented bus admittance matrix
	 */
//	@SuppressWarnings("static-access")
//	public static SparseDComplexLUDecomposition jd_AugYbus(double baseMVA, Djp_bus bus, Djp_branch branch,
//			DoubleMatrix1D xd_tr, int[] gbus, DoubleMatrix1D P, DoubleMatrix1D Q, DComplexMatrix1D U0) {
//
//		DComplexMatrix1D yload, ygen;
//		DComplexMatrix2D Ybus;
//		DComplexMatrix2D[] Y;
//
//		/* Calculate bus admittance matrix */
//		Y = Djp_makeYbus.jp_makeYbus(baseMVA, bus, branch);
//		Ybus = Y[0];
//
//		/* Calculate equivalent load admittance */
//		yload = Djp_util.complex(P, Q).assign(cfunc.conj);
//		yload.assign(U0.copy().assign(cfunc.abs).assign(cfunc.square), cfunc.div);
//
//		/* Calculate equivalent generator admittance */
//		ygen = DComplexFactory1D.dense.make(Ybus.rows());
//		ygen.viewSelection(gbus).assign( Djp_util.complex(null, xd_tr).assign(cfunc.inv) );
//
//		/* Add equivalent load and generator admittance to Ybus matrix */
//		for (int i = 0; i < Ybus.rows(); i++)
//			Ybus.set(i, i, cfunc.plus.apply( cfunc.plus.apply(Ybus.get(i, i), ygen.get(i)), yload.get(i) ));
//
//		return SparseDComplexAlgebra.DEFAULT.lu(Ybus, 0);
//	}

}
