package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: koq  reason: default package */
/* loaded from: classes7.dex */
public final class koq implements koj {
    private final Context a;
    private final noo b;
    private final dcdc<koi> c;

    public koq(Context context, noo nooVar, dcdc<koi> dcdcVar) {
        this.a = context;
        this.b = nooVar;
        dbsk.s(dcdcVar);
        this.c = dcdcVar;
    }

    @Override // defpackage.koj
    public CharSequence a() {
        return this.a.getString(R.string.EV_HOST);
    }

    @Override // defpackage.koj
    public cqkl b() {
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.koj
    public cqkl c() {
        this.b.b();
        return cqkl.a;
    }

    @Override // defpackage.koj
    /* renamed from: e */
    public dcdc<koi> d() {
        return this.c;
    }
}
