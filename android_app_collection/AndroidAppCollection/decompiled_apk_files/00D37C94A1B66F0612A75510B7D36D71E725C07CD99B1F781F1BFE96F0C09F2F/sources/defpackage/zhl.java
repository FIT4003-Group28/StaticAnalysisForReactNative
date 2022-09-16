package defpackage;
/* compiled from: PG */
/* renamed from: zhl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zhl implements ayqa {
    public final /* synthetic */ ankt a;
    private final /* synthetic */ int b;

    public /* synthetic */ zhl(ankt anktVar, int i) {
        this.b = i;
        this.a = anktVar;
    }

    @Override // defpackage.ayqa
    public final void a() {
        int i = this.b;
        if (i == 0) {
            this.a.cancel(true);
        } else if (i == 1) {
            this.a.cancel(true);
        } else {
            this.a.cancel(false);
        }
    }
}
