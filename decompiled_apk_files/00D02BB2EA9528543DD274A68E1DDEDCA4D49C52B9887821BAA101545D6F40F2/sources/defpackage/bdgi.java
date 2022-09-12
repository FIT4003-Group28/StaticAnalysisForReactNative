package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdgi  reason: default package */
/* loaded from: classes3.dex */
public class bdgi implements bdgt {
    final /* synthetic */ boolean a;
    final /* synthetic */ bdgj b;

    public bdgi(bdgj bdgjVar, boolean z) {
        this.b = bdgjVar;
        this.a = z;
    }

    @Override // defpackage.bdgt
    public cqkl a() {
        if (!this.a) {
            this.b.bn();
            final bdgj bdgjVar = this.b;
            bdgjVar.a = bdgjVar.w(bdgjVar.c);
            bdgjVar.J().runOnUiThread(new Runnable(bdgjVar) { // from class: bdgh
                private final bdgj a;

                {
                    this.a = bdgjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bdgj bdgjVar2 = this.a;
                    cqkf<bdgt> cqkfVar = bdgjVar2.b;
                    dbsk.s(cqkfVar);
                    cqkfVar.e(bdgjVar2.a);
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bdgt
    public cqkl b() {
        if (!this.a) {
            this.b.aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.bdgt
    public Boolean c() {
        return Boolean.valueOf(this.b.c);
    }

    @Override // defpackage.bdgt
    public CharSequence d() {
        if (this.b.bo()) {
            return this.b.g.getString(R.string.DELETE_USER_VIDEO_CONFIRMATION_TITLE);
        }
        return this.b.g.getString(R.string.DELETE_USER_PHOTO_CONFIRMATION_TITLE);
    }

    @Override // defpackage.bdgt
    public CharSequence e() {
        if (this.b.bo()) {
            return this.b.g.getString(R.string.DELETE_USER_VIDEO_CONFIRMATION_BODY);
        }
        return this.b.g.getString(R.string.DELETE_USER_PHOTO_CONFIRMATION_BODY);
    }

    @Override // defpackage.bdgt
    public CharSequence f() {
        return this.b.g.getString(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.bdgt
    public CharSequence g() {
        return this.b.g.getString(R.string.DELETE_BUTTON);
    }
}
