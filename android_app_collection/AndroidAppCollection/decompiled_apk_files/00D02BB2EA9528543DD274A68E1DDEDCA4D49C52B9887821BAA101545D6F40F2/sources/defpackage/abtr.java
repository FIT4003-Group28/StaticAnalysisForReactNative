package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abtr  reason: default package */
/* loaded from: classes2.dex */
public class abtr implements iao {
    final /* synthetic */ abts a;
    private final String b;
    private final cjtd c;

    public abtr(abts abtsVar, int i, String str, String str2, cjta cjtaVar) {
        this.a = abtsVar;
        this.b = str;
        cjtaVar.g(str2);
        this.c = cjtaVar.a();
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.b;
    }

    @Override // defpackage.iao
    /* renamed from: h */
    public String c() {
        return this.a.d.getString(R.string.TAB_ON_TAB_BAR, new Object[]{a()});
    }
}
