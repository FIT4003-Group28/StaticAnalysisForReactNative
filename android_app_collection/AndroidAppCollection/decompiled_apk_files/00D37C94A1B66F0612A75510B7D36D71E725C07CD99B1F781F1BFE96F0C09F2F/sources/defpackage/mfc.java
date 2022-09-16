package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mfc  reason: default package */
/* loaded from: classes3.dex */
public final class mfc {
    audg a;
    final boolean b;
    final boolean c;

    public mfc(audg audgVar, aaks aaksVar) {
        this.a = audgVar;
        boolean z = true;
        this.b = aaksVar != null && aaksVar.c();
        this.c = (aaksVar == null || !aaksVar.d()) ? false : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final apos a() {
        aunb aunbVar;
        aunb aunbVar2;
        audg audgVar = this.a;
        if (audgVar.e == 34) {
            aunbVar = (aunb) audgVar.f;
        } else {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(ButtonRendererOuterClass.toggleButtonRenderer)) {
            return null;
        }
        audg audgVar2 = this.a;
        if (audgVar2.e == 34) {
            aunbVar2 = (aunb) audgVar2.f;
        } else {
            aunbVar2 = aunb.a;
        }
        return (apos) aunbVar2.qm(ButtonRendererOuterClass.toggleButtonRenderer);
    }
}
