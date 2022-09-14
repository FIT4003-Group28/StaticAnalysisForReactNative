package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abvb  reason: default package */
/* loaded from: classes2.dex */
public class abvb implements abol {
    final /* synthetic */ gga a;
    final /* synthetic */ dxio b;

    public abvb(gga ggaVar, dxio dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.abol
    public String a() {
        return this.a.getString(R.string.EXPLORE_LISTS_FAME_FOCUSED_PROMO_TITLE);
    }

    @Override // defpackage.abol
    public String b() {
        return this.a.getString(R.string.EXPLORE_LISTS_FAME_FOCUSED_PROMO_DESCRIPTION);
    }

    @Override // defpackage.abol
    public cqkl c() {
        ((axwy) this.b.a()).n();
        return cqkl.a;
    }
}
