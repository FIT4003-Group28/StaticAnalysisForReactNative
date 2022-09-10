package defpackage;
/* compiled from: PG */
/* renamed from: bdwj  reason: default package */
/* loaded from: classes3.dex */
final class bdwj implements hxb {
    final /* synthetic */ bdwk a;

    public bdwj(bdwk bdwkVar) {
        this.a = bdwkVar;
    }

    @Override // defpackage.hxb
    public final void a(jib jibVar) {
        float f = 255.0f;
        float f2 = jibVar.x / 255.0f;
        bdwk bdwkVar = this.a;
        boolean z = true;
        if (!bdwkVar.d) {
            f = f2;
        } else if (true != bdwkVar.c) {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            z = false;
        }
        bdwkVar.c = z;
        bdwkVar.b.setTitleAlpha(f);
    }
}
