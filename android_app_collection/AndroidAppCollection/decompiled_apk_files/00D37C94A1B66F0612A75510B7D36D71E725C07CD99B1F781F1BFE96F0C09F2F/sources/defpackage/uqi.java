package defpackage;
/* compiled from: PG */
/* renamed from: uqi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uqi implements ampg {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ uqi(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public /* synthetic */ uqi(String str, int i, int i2) {
        this.c = i2;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return ((uqe) obj).f(this.a, this.b);
        } else if (i == 1) {
            return ((uqe) obj).e(this.a, this.b);
        } else {
            String str = this.a;
            int i2 = this.b;
            aopa mo52toBuilder = ((awux) obj).mo52toBuilder();
            String valueOf = String.valueOf(str);
            mo52toBuilder.bs(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.badgecount.badgecount".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.badgecount.badgecount"), i2);
            return (awux) mo52toBuilder.mo39build();
        }
    }
}
