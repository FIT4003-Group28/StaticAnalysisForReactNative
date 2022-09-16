package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: admd  reason: default package */
/* loaded from: classes2.dex */
public class admd implements admb {
    public boolean a;
    @dzsi
    private final String b;
    private final String c;
    private final int d;

    private admd(@dzsi String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @dzsi
    public static admd e(aczr aczrVar) {
        String str = aczrVar.e().d;
        if (dbsj.d(str)) {
            return null;
        }
        return new admd(aczrVar.e().e, str, aczrVar.d().intValue());
    }

    @Override // defpackage.admb
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.admb
    public cjtd b(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.b = this.b;
        b.g(this.c);
        return b.a();
    }

    @Override // defpackage.admb
    public View.OnClickListener c() {
        return new View.OnClickListener(this) { // from class: admc
            private final admd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                admd admdVar = this.a;
                admdVar.a = true;
                cqkx.p(admdVar);
            }
        };
    }

    @Override // defpackage.admb
    public Integer d() {
        return Integer.valueOf(this.d);
    }
}
