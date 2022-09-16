package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcac  reason: default package */
/* loaded from: classes3.dex */
public final class bcac implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof bbzz) {
            bbzz bbzzVar = bbzz.IS_RECORDING;
            int ordinal = ((bbzz) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 || !(view instanceof bcab) || !(obj instanceof Runnable)) {
                    return false;
                }
                ((bcab) view).g = (Runnable) obj;
                return true;
            } else if (!(view instanceof bcab) || !(obj instanceof Boolean)) {
                return false;
            } else {
                final bcab bcabVar = (bcab) view;
                if (!((Boolean) obj).booleanValue()) {
                    bcabVar.f.a(new bcad(bcabVar) { // from class: bbzs
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            ((bcag) obj2).a(new bcad(this.a) { // from class: bbzk
                                private final bcab a;

                                {
                                    this.a = r1;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar2 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(300L);
                                    bcafVar.c(bcabVar2.a);
                                    bcafVar.a("scaleX", 1.0f);
                                    bcafVar.a("scaleY", 1.0f);
                                    bcafVar.a("fillAlpha", 0.25f);
                                }
                            });
                        }
                    });
                    bcabVar.e.a(new bcad(bcabVar) { // from class: bbzt
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            final bcab bcabVar2 = this.a;
                            ((bcag) obj2).a(new bcad(bcabVar2) { // from class: bbzw
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(300L);
                                    bcafVar.c(bcabVar3.a);
                                    bcafVar.a("scaleX", 1.0f);
                                    bcafVar.a("scaleY", 1.0f);
                                    bcafVar.a("alpha", 0.0f);
                                }
                            });
                        }
                    });
                    bcabVar.d.a(new bcad(bcabVar) { // from class: bbzu
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            final bcab bcabVar2 = this.a;
                            ((bcag) obj2).a(new bcad(bcabVar2) { // from class: bbzv
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(300L);
                                    bcafVar.c(bcabVar3.a);
                                    bcafVar.a("scaleX", 1.0f);
                                    bcafVar.a("scaleY", 1.0f);
                                    bcafVar.a("alpha", 0.0f);
                                }
                            });
                        }
                    });
                } else {
                    bcabVar.f.a(new bcad(bcabVar) { // from class: bbzj
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            final bcab bcabVar2 = this.a;
                            ((bcag) obj2).a(new bcad(bcabVar2) { // from class: bbzp
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(1000L);
                                    bcafVar.c(bcabVar3.a);
                                    bcafVar.a("scaleX", 1.14f);
                                    bcafVar.a("scaleY", 1.14f);
                                    bcafVar.a("fillAlpha", 1.0f);
                                }
                            });
                        }
                    });
                    bcabVar.e.a(new bcad(bcabVar) { // from class: bbzq
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            bcab bcabVar2 = this.a;
                            bcag bcagVar = (bcag) obj2;
                            bcagVar.a(new bcad(bcabVar2) { // from class: bbzn
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(3000L);
                                    bcafVar.c(bcabVar3.b);
                                    bcafVar.a("scaleX", 2.5f);
                                    bcafVar.a("scaleY", 2.5f);
                                }
                            });
                            bcagVar.a(new bcad(bcabVar2) { // from class: bbzo
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(300L);
                                    bcafVar.c(bcabVar3.a);
                                    bcafVar.a("alpha", 1.0f);
                                }
                            });
                        }
                    });
                    bcabVar.d.a(new bcad(bcabVar) { // from class: bbzr
                        private final bcab a;

                        {
                            this.a = bcabVar;
                        }

                        @Override // defpackage.bcad
                        public final void a(Object obj2) {
                            bcab bcabVar2 = this.a;
                            bcag bcagVar = (bcag) obj2;
                            bcagVar.c = bcabVar2.h;
                            bcagVar.a(new bcad(bcabVar2) { // from class: bbzl
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(10000L);
                                    bcafVar.c(bcabVar3.c);
                                    bcafVar.a("scaleX", 2.5f);
                                    bcafVar.a("scaleY", 2.5f);
                                }
                            });
                            bcagVar.a(new bcad(bcabVar2) { // from class: bbzm
                                private final bcab a;

                                {
                                    this.a = bcabVar2;
                                }

                                @Override // defpackage.bcad
                                public final void a(Object obj3) {
                                    bcab bcabVar3 = this.a;
                                    bcaf bcafVar = (bcaf) obj3;
                                    bcafVar.b(1000L);
                                    bcafVar.c(bcabVar3.a);
                                    bcafVar.a("alpha", 1.0f);
                                }
                            });
                        }
                    });
                }
                bcabVar.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
