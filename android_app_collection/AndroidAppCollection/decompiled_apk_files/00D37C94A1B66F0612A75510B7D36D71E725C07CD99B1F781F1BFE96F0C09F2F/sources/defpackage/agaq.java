package defpackage;

import android.content.Intent;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: agaq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agaq implements Function {
    public final /* synthetic */ Intent a;
    private final /* synthetic */ int b;

    public /* synthetic */ agaq(Intent intent, int i) {
        this.b = i;
        this.a = intent;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Intent intent = this.a;
            apgk apgkVar = (apgk) obj;
            if ((apgkVar.b & 1) != 0) {
                apzg apzgVar = apgkVar.c;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                agec.a(intent, apzgVar, null, false);
                apzg apzgVar2 = apgkVar.d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                ahfe.d(intent, apzgVar2);
                return Optional.of(intent);
            }
            zep.b("Payload does not have the required navigation endpoint.");
            return Optional.empty();
        }
        Intent intent2 = this.a;
        apgi apgiVar = (apgi) obj;
        if ((apgiVar.b & 1) != 0) {
            apzg apzgVar3 = apgiVar.c;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            agec.a(intent2, apzgVar3, null, false);
            apzg apzgVar4 = apgiVar.d;
            if (apzgVar4 == null) {
                apzgVar4 = apzg.a;
            }
            ahfe.d(intent2, apzgVar4);
            return Optional.of(intent2);
        }
        zep.b("Payload does not have the required navigation endpoint.");
        return Optional.empty();
    }
}
