package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bhde  reason: default package */
/* loaded from: classes3.dex */
public final class bhde {
    public static bhds a(dged dgedVar, bhdj bhdjVar, @dzsi ilo iloVar, int i) {
        bhds k = bhdt.k();
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        k.b(dgecVar.b);
        dgec dgecVar2 = dgedVar.b;
        if (dgecVar2 == null) {
            dgecVar2 = dgec.i;
        }
        bhdl bhdlVar = (bhdl) k;
        bhdlVar.e = dgecVar2.c;
        dgec dgecVar3 = dgedVar.b;
        if (dgecVar3 == null) {
            dgecVar3 = dgec.i;
        }
        jic jicVar = null;
        if ((dgecVar3.a & 16) == 0) {
            dgef b = dgef.b(dgedVar.a);
            if (b == null) {
                b = dgef.UNKNOWN_RECOMMENDATION_TYPE;
            }
            if (b == dgef.CHECK_NEW_REVIEWS) {
                dgdn dgdnVar = dgedVar.c;
                if (dgdnVar == null) {
                    dgdnVar = dgdn.d;
                }
                if ((dgdnVar.a & 1) != 0) {
                    dgdn dgdnVar2 = dgedVar.c;
                    if (dgdnVar2 == null) {
                        dgdnVar2 = dgdn.d;
                    }
                    dgdy dgdyVar = dgdnVar2.b;
                    if (dgdyVar == null) {
                        dgdyVar = dgdy.b;
                    }
                    if (!dgdyVar.a.isEmpty()) {
                        jicVar = new jic(dgdyVar.a.get(0).a, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
                    }
                }
            }
        } else {
            dgec dgecVar4 = dgedVar.b;
            if (dgecVar4 == null) {
                dgecVar4 = dgec.i;
            }
            dggq dggqVar = dgecVar4.f;
            if (dggqVar == null) {
                dggqVar = dggq.d;
            }
            jicVar = new jic(dggqVar.a, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
        }
        bhdlVar.f = jicVar;
        bhdlVar.c = bhcs.a(dgedVar, bhdjVar, iloVar, i);
        c(k, dgedVar, bhdjVar);
        bhco.a(k, dgedVar, iloVar, i);
        return k;
    }

    public static bhds b(dged dgedVar, bhdj bhdjVar, @dzsi ilo iloVar, int i) {
        jhp jhpVar;
        String str;
        bhds k = bhdt.k();
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        k.b(dgecVar.b);
        dgec dgecVar2 = dgedVar.b;
        if (dgecVar2 == null) {
            dgecVar2 = dgec.i;
        }
        if ((dgecVar2.a & 16) != 0) {
            dgec dgecVar3 = dgedVar.b;
            if (dgecVar3 == null) {
                dgecVar3 = dgec.i;
            }
            dggq dggqVar = dgecVar3.f;
            if (dggqVar == null) {
                dggqVar = dggq.d;
            }
            String str2 = dggqVar.a;
            dgec dgecVar4 = dgedVar.b;
            if (dgecVar4 == null) {
                dgecVar4 = dgec.i;
            }
            if ((dgecVar4.a & 32) != 0) {
                dgec dgecVar5 = dgedVar.b;
                if (dgecVar5 == null) {
                    dgecVar5 = dgec.i;
                }
                dggq dggqVar2 = dgecVar5.g;
                if (dggqVar2 == null) {
                    dggqVar2 = dggq.d;
                }
                str = dggqVar2.a;
            } else {
                str = str2;
            }
            jhpVar = new jhp(str2, str, ckqc.FULLY_QUALIFIED);
        } else {
            jhpVar = null;
        }
        bhdl bhdlVar = (bhdl) k;
        bhdlVar.d = jhpVar;
        bhdlVar.c = bhcs.a(dgedVar, bhdjVar, iloVar, i);
        c(k, dgedVar, bhdjVar);
        bhco.a(k, dgedVar, iloVar, i);
        return k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void c(bhds bhdsVar, final dged dgedVar, final bhdj bhdjVar) {
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        if ((dgecVar.a & 4) != 0) {
            dgec dgecVar2 = dgedVar.b;
            if (dgecVar2 == null) {
                dgecVar2 = dgec.i;
            }
            dgdw dgdwVar = dgecVar2.d;
            if (dgdwVar == null) {
                dgdwVar = dgdw.g;
            }
            bhdl bhdlVar = (bhdl) bhdsVar;
            bhdlVar.a = dgdwVar.b;
            if ((dgdwVar.a & 16) == 0) {
                return;
            }
            dgdr dgdrVar = dgdr.UNKNOWN_CTA_INTENT;
            dgef dgefVar = dgef.UNKNOWN_RECOMMENDATION_TYPE;
            dgdr b = dgdr.b(dgdwVar.e);
            if (b == null) {
                b = dgdr.UNKNOWN_CTA_INTENT;
            }
            switch (b.ordinal()) {
                case 1:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhcw
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.f();
                        }
                    };
                    return;
                case 2:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhct
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.d();
                        }
                    };
                    return;
                case 3:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhcv
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.e();
                        }
                    };
                    return;
                case 4:
                case 5:
                    dgbo dgboVar = dgdwVar.d;
                    if (dgboVar == null) {
                        dgboVar = dgbo.e;
                    }
                    if ((dgboVar.a & 2) == 0) {
                        return;
                    }
                    dgbo dgboVar2 = dgdwVar.d;
                    if (dgboVar2 == null) {
                        dgboVar2 = dgbo.e;
                    }
                    final String str = dgboVar2.c;
                    bhdlVar.b = new View.OnClickListener(bhdjVar, str) { // from class: bhcz
                        private final bhdj a;
                        private final String b;

                        {
                            this.a = bhdjVar;
                            this.b = str;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.g(this.b);
                        }
                    };
                    return;
                case 6:
                case 7:
                default:
                    int a = dgdv.a(dgdwVar.c);
                    if (a == 0 || a != 5) {
                        return;
                    }
                    dgbo dgboVar3 = dgdwVar.d;
                    if (dgboVar3 == null) {
                        dgboVar3 = dgbo.e;
                    }
                    if ((dgboVar3.a & 2) == 0) {
                        return;
                    }
                    dgbo dgboVar4 = dgdwVar.d;
                    if (dgboVar4 == null) {
                        dgboVar4 = dgbo.e;
                    }
                    final String str2 = dgboVar4.c;
                    bhdlVar.b = new View.OnClickListener(bhdjVar, str2) { // from class: bhcu
                        private final bhdj a;
                        private final String b;

                        {
                            this.a = bhdjVar;
                            this.b = str2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.c(this.b);
                        }
                    };
                    return;
                case 8:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhcx
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.h();
                        }
                    };
                    return;
                case 9:
                    break;
                case 10:
                    bhdlVar.b = new View.OnClickListener(bhdjVar, dgedVar) { // from class: bhcy
                        private final bhdj a;
                        private final dged b;

                        {
                            this.a = bhdjVar;
                            this.b = dgedVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bhdj bhdjVar2 = this.a;
                            dged dgedVar2 = this.b;
                            dgdn dgdnVar = dgedVar2.c;
                            if (dgdnVar == null) {
                                dgdnVar = dgdn.d;
                            }
                            if ((dgdnVar.a & 2) != 0) {
                                dgdn dgdnVar2 = dgedVar2.c;
                                if (dgdnVar2 == null) {
                                    dgdnVar2 = dgdn.d;
                                }
                                dgea dgeaVar = dgdnVar2.c;
                                if (dgeaVar == null) {
                                    dgeaVar = dgea.c;
                                }
                                Object[] objArr = new Object[2];
                                objArr[0] = dgeaVar.a;
                                dgbo dgboVar5 = dgeaVar.b;
                                if (dgboVar5 == null) {
                                    dgboVar5 = dgbo.e;
                                }
                                objArr[1] = dgboVar5.c;
                                String format = String.format("%s %s", objArr);
                                dgec dgecVar3 = dgedVar2.b;
                                if (dgecVar3 == null) {
                                    dgecVar3 = dgec.i;
                                }
                                dgdw dgdwVar2 = dgecVar3.d;
                                if (dgdwVar2 == null) {
                                    dgdwVar2 = dgdw.g;
                                }
                                bhdjVar2.i(format, dgdwVar2.b);
                            }
                        }
                    };
                    return;
                case 11:
                    dgbo dgboVar5 = dgdwVar.d;
                    if (dgboVar5 == null) {
                        dgboVar5 = dgbo.e;
                    }
                    if ((dgboVar5.a & 2) != 0) {
                        dgbo dgboVar6 = dgdwVar.d;
                        if (dgboVar6 == null) {
                            dgboVar6 = dgbo.e;
                        }
                        final String str3 = dgboVar6.c;
                        bhdlVar.b = new View.OnClickListener(bhdjVar, str3) { // from class: bhda
                            private final bhdj a;
                            private final String b;

                            {
                                this.a = bhdjVar;
                                this.b = str3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.k(this.b);
                            }
                        };
                        return;
                    }
                    break;
                case 12:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhdc
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.m();
                        }
                    };
                    return;
                case 13:
                    bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhdd
                        private final bhdj a;

                        {
                            this.a = bhdjVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.n();
                        }
                    };
                    return;
            }
            bhdlVar.b = new View.OnClickListener(bhdjVar) { // from class: bhdb
                private final bhdj a;

                {
                    this.a = bhdjVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l();
                }
            };
        }
    }
}
