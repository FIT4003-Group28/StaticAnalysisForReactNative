package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;
/* compiled from: PG */
/* renamed from: ajjn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajjn {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ajjo.a;
    }

    public static float a(ajke ajkeVar) {
        return ajkeVar.f57J;
    }

    public static int b(ajke ajkeVar) {
        return ajkeVar.E;
    }

    public static teb c(tec tecVar) {
        return new ajhg(tecVar);
    }

    public static ajik d() {
        return new ajik();
    }

    public static ajke e(ajjr ajjrVar) {
        return ajjrVar.a();
    }

    public static ampq f() {
        return ampq.i(BlocksRuntimeProxy.createContainerLoader());
    }

    public static ampt g(final aadd aaddVar) {
        return new ampt() { // from class: ajjm
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                aadd aaddVar2 = aadd.this;
                Integer num = (Integer) obj;
                int i = ajjn.a;
                asxp asxpVar = aaddVar2.a().e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                return asxpVar.aW.contains(num);
            }
        };
    }

    public static boolean h(ajke ajkeVar) {
        return ajkeVar.L;
    }

    public static boolean i(ajke ajkeVar) {
        return ajkeVar.G;
    }

    public static boolean j(ajke ajkeVar) {
        return ajkeVar.M;
    }

    public static boolean k(ajke ajkeVar) {
        return ajkeVar.x;
    }

    public static boolean l(ajke ajkeVar) {
        return ajkeVar.n;
    }

    public static boolean m(ajke ajkeVar) {
        return ajkeVar.A;
    }

    public static boolean n(ajke ajkeVar) {
        return ajkeVar.s;
    }

    public static boolean o(ajke ajkeVar) {
        return ajkeVar.D;
    }

    public static boolean p(ajke ajkeVar) {
        return ajkeVar.d == 2;
    }

    public static boolean q(ajke ajkeVar) {
        return ajkeVar.m;
    }

    public static ste r(aacz aaczVar) {
        Boolean bool;
        JSControllerInitializationMode jSControllerInitializationMode = JSControllerInitializationMode.DEFAULT;
        aunf aunfVar = aaczVar.b().l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        String str = aunfVar.n;
        if ("default".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.DEFAULT;
        } else if ("eager_context_initialization".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.EAGER_CONTEXT_INITIALIZATION;
        } else if ("eager_module_loading".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.EAGER_MODULE_LOADING;
        }
        std stdVar = new std();
        stdVar.b(JSControllerInitializationMode.DEFAULT);
        stdVar.a(false);
        stdVar.c(5);
        stdVar.b(jSControllerInitializationMode);
        aunf aunfVar2 = aaczVar.b().l;
        if (aunfVar2 == null) {
            aunfVar2 = aunf.a;
        }
        if ((aunfVar2.e & 1024) != 0) {
            aunf aunfVar3 = aaczVar.b().l;
            if (aunfVar3 == null) {
                aunfVar3 = aunf.a;
            }
            stdVar.a(aunfVar3.f119J);
        }
        aunf aunfVar4 = aaczVar.b().l;
        if (aunfVar4 == null) {
            aunfVar4 = aunf.a;
        }
        if ((aunfVar4.e & 2048) != 0) {
            aunf aunfVar5 = aaczVar.b().l;
            if (aunfVar5 == null) {
                aunfVar5 = aunf.a;
            }
            stdVar.c(aunfVar5.K);
        }
        JSControllerInitializationMode jSControllerInitializationMode2 = stdVar.a;
        if (jSControllerInitializationMode2 == null || (bool = stdVar.b) == null || stdVar.c == null) {
            StringBuilder sb = new StringBuilder();
            if (stdVar.a == null) {
                sb.append(" initializationMode");
            }
            if (stdVar.b == null) {
                sb.append(" enableVmContextLru");
            }
            if (stdVar.c == null) {
                sb.append(" vmContextLruSize");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ste(jSControllerInitializationMode2, bool.booleanValue(), stdVar.c.intValue());
    }

    public static stf s(axnm axnmVar) {
        return new stf(axnmVar);
    }

    public static ampg t(final aacz aaczVar) {
        return new ampg() { // from class: ajjl
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aacz aaczVar2 = aacz.this;
                Integer num = (Integer) obj;
                int i = ajjn.a;
                aunf aunfVar = aaczVar2.b().l;
                if (aunfVar == null) {
                    aunfVar = aunf.a;
                }
                aunc auncVar = aunfVar.I;
                if (auncVar == null) {
                    auncVar = aunc.a;
                }
                for (aund aundVar : auncVar.b) {
                    if (aundVar.b == num.intValue()) {
                        awmu awmuVar = aundVar.c;
                        return awmuVar == null ? awmu.a : awmuVar;
                    }
                }
                return null;
            }
        };
    }

    public static boolean u(aacz aaczVar) {
        aunf aunfVar = aaczVar.b().l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        return aunfVar.x;
    }

    public static boolean v(aacz aaczVar) {
        aunf aunfVar = aaczVar.b().l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        return aunfVar.y;
    }

    public static boolean w(aacz aaczVar) {
        aunf aunfVar = aaczVar.b().l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        return aunfVar.B;
    }

    public static tfa x(tdb tdbVar, Context context, String str) {
        return new tbw(tdbVar, str, context);
    }

    public static boolean y(aacz aaczVar) {
        aunf aunfVar = aaczVar.b().l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        return aunfVar.m;
    }

    public static String z() {
        String str = awtj.a.b;
        return str.isEmpty() ? "10.0.2.2" : str;
    }
}
