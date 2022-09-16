package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahlj  reason: default package */
/* loaded from: classes.dex */
public final class ahlj implements ahjt {
    final /* synthetic */ ahlk a;
    final /* synthetic */ ahpt b;

    public ahlj(ahlk ahlkVar, ahpt ahptVar) {
        this.a = ahlkVar;
        this.b = ahptVar;
    }

    @Override // defpackage.ahjt
    public final void a() {
        ahlk ahlkVar = this.a;
        ahlkVar.g = !ahlkVar.g;
        ahlkVar.a();
        ahpt ahptVar = this.b;
        boolean z = this.a.f;
        final ahpx ahpxVar = ahptVar.a.a;
        final int i = true != z ? -2 : 2160;
        ahpxVar.a.post(new Runnable() { // from class: ahpr
            @Override // java.lang.Runnable
            public final void run() {
                ahpx ahpxVar2 = ahpx.this;
                int i2 = i;
                aicg aicgVar = ahpxVar2.h;
                if (aicgVar != null) {
                    aicgVar.w(i2);
                }
            }
        });
    }
}
