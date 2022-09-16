package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import j$.util.function.Function;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: aejj  reason: default package */
/* loaded from: classes.dex */
public final class aejj implements afhs {
    public final afhu a;
    private final afle b;
    private final afgz c;
    private final Function d;

    public aejj(afle afleVar, afgz afgzVar, Function function, afhu afhuVar) {
        this.b = afleVar;
        this.c = afgzVar;
        this.d = function;
        this.a = afhuVar;
    }

    @Override // defpackage.afhs
    public final aeij a(aeii aeiiVar) {
        aeje aejeVar = (aeje) this.d.apply(aeiiVar.b);
        afle afleVar = this.b;
        afgz afgzVar = this.c;
        aflc a = afld.a(aejeVar.b);
        a.a = aeiiVar.b;
        a.g = ampq.j(aeiiVar.c);
        a.h = aejeVar.a;
        a.d = aejeVar.c;
        byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(new aejl(afleVar, afgzVar, a.a(), Executors.newFixedThreadPool(12), new Function() { // from class: aeji
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                afhu afhuVar = aejj.this.a;
                String str = ((aejm) obj).g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                sb.append("new NetworkClientCallbackNativeHandler(");
                sb.append(str);
                sb.append(")");
                afhv a2 = afhuVar.a(sb.toString().getBytes());
                if (a2 == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                    sb2.append("Instance \"");
                    sb2.append(str);
                    sb2.append("\" is not valid.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                return new afhr(a2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }));
        aopa createBuilder = aeij.a.createBuilder();
        aoob x = aoob.x(nativeRetainObjectReference);
        createBuilder.copyOnWrite();
        aeij aeijVar = (aeij) createBuilder.instance;
        aeijVar.b |= 1;
        aeijVar.c = x;
        return (aeij) createBuilder.mo39build();
    }

    @Override // defpackage.afhs
    public final aejg b(aejf aejfVar) {
        NativeSupport.nativeReleaseObjectReference(aejfVar.b.I());
        return aejg.a;
    }
}
