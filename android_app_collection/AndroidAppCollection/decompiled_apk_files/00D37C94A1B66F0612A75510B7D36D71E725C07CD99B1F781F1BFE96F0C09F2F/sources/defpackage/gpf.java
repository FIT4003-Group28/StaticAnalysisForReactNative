package defpackage;
/* compiled from: PG */
/* renamed from: gpf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpf implements ampg {
    public final /* synthetic */ gpg a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpf(gpg gpgVar) {
        this.a = gpgVar;
    }

    public /* synthetic */ gpf(gpg gpgVar, int i) {
        this.b = i;
        this.a = gpgVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            gpg gpgVar = this.a;
            aotg aotgVar = (aotg) obj;
            if (!aotgVar.c.isEmpty()) {
                gpgVar.b = aotgVar.c;
                gpgVar.f = aotgVar.d;
                apzg apzgVar = aotgVar.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                gpgVar.c = apzgVar;
                apzg apzgVar2 = aotgVar.f;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                gpgVar.d = apzgVar2;
                apzg apzgVar3 = aotgVar.g;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                gpgVar.e = apzgVar3;
                return true;
            }
            return false;
        }
        gpg gpgVar2 = this.a;
        aopa mo52toBuilder = ((aotg) obj).mo52toBuilder();
        String str = gpgVar2.b;
        mo52toBuilder.copyOnWrite();
        aotg aotgVar2 = (aotg) mo52toBuilder.instance;
        str.getClass();
        aotgVar2.b = 1 | aotgVar2.b;
        aotgVar2.c = str;
        String str2 = gpgVar2.f;
        mo52toBuilder.copyOnWrite();
        aotg aotgVar3 = (aotg) mo52toBuilder.instance;
        str2.getClass();
        aotgVar3.b |= 2;
        aotgVar3.d = str2;
        apzg apzgVar4 = gpgVar2.c;
        mo52toBuilder.copyOnWrite();
        aotg aotgVar4 = (aotg) mo52toBuilder.instance;
        apzgVar4.getClass();
        aotgVar4.e = apzgVar4;
        aotgVar4.b |= 4;
        apzg apzgVar5 = gpgVar2.d;
        mo52toBuilder.copyOnWrite();
        aotg aotgVar5 = (aotg) mo52toBuilder.instance;
        apzgVar5.getClass();
        aotgVar5.f = apzgVar5;
        aotgVar5.b |= 8;
        apzg apzgVar6 = gpgVar2.e;
        mo52toBuilder.copyOnWrite();
        aotg aotgVar6 = (aotg) mo52toBuilder.instance;
        apzgVar6.getClass();
        aotgVar6.g = apzgVar6;
        aotgVar6.b |= 16;
        return (aotg) mo52toBuilder.mo39build();
    }
}
