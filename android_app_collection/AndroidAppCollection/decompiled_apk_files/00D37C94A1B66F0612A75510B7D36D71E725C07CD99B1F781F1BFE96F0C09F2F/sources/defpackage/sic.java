package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sic  reason: default package */
/* loaded from: classes4.dex */
public final class sic {
    public static final String a;
    private static final amzy b = amzy.l("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager");
    private static final String c;
    private static boolean d;

    static {
        String str = Build.SUPPORTED_ABIS[0];
        c = str;
        a = String.format("assets/%s/libfaceviewer_jni.so", str);
        d = false;
    }

    private sic() {
    }

    public static boolean a(String str) {
        try {
            aneu.a(str);
            d = true;
            ((amzw) ((amzw) b.e()).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager", "tryLoadingJNILib", 51, "NativeLibManager.java")).q("Native Library loaded.");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            ((amzw) ((amzw) ((amzw) b.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager", "tryLoadingJNILib", '6', "NativeLibManager.java")).q("Error loading native library.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized ankt b(final Context context, Executor executor) {
        synchronized (sic.class) {
            if (d) {
                return anlz.q(true);
            }
            return anlz.v(new aniq() { // from class: sib
                @Override // defpackage.aniq
                public final ankt a() {
                    Context context2 = context;
                    if (!sic.a("drishti_jni_native")) {
                        final alto altoVar = (alto) ((altb) anlz.C(context2)).a.get();
                        if (altoVar.b().contains("faceviewer_split")) {
                            return anlz.q(Boolean.valueOf(sic.a(sic.a)));
                        }
                        return aed.c(new agr() { // from class: shy
                            @Override // defpackage.agr
                            public final Object a(final agp agpVar) {
                                alto altoVar2 = alto.this;
                                altu altuVar = new altu();
                                altuVar.a.add("faceviewer_split");
                                alvd a2 = altoVar2.a(new altv(altuVar));
                                a2.e(new alvb() { // from class: sia
                                    @Override // defpackage.alvb
                                    public final void a(Object obj) {
                                        Integer num = (Integer) obj;
                                        agp.this.c(Boolean.valueOf(sic.a(sic.a)));
                                    }
                                });
                                a2.d(new aluy() { // from class: shz
                                    @Override // defpackage.aluy
                                    public final void a(Exception exc) {
                                        agp agpVar2 = agp.this;
                                        String str = sic.a;
                                        agpVar2.d(exc);
                                    }
                                });
                                return "NativeLibManager.loadSlpitLib";
                            }
                        });
                    }
                    return anlz.q(true);
                }
            }, executor);
        }
    }
}
