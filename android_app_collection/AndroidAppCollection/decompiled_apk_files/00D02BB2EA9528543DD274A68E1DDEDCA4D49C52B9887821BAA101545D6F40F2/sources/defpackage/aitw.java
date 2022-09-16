package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitw  reason: default package */
/* loaded from: classes2.dex */
public class aitw implements aiui {
    public aink a;
    @dzsi
    public akqq b;
    public dkog c;
    public jht d = g();
    public final aitm e;
    private final cqat f;
    private final Resources g;
    private final aito h;
    private final Context i;
    private final boolean j;

    public aitw(aink ainkVar, cqat cqatVar, cqhn cqhnVar, ajsc ajscVar, Resources resources, Context context, dkog dkogVar, @dzsi akqq akqqVar, bvsl bvslVar, aito aitoVar, boolean z) {
        this.a = ainkVar;
        this.f = cqatVar;
        this.i = context;
        this.g = resources;
        this.j = z;
        this.c = dkogVar;
        this.h = aitoVar;
        this.e = new aitm(ainkVar, cqatVar, cqhnVar, ajscVar, resources, dkogVar, akqqVar, bvslVar);
        this.b = akqqVar;
    }

    @Override // defpackage.aiui
    public CharSequence a() {
        return this.a.a().b().b().b();
    }

    @Override // defpackage.aiui
    public aitc b() {
        return this.e;
    }

    @Override // defpackage.aiui
    public Boolean c() {
        return Boolean.valueOf(this.a.s(aiua.v(this.f)));
    }

    @Override // defpackage.aiui
    public Boolean d() {
        return Boolean.valueOf(!this.a.d().isEmpty());
    }

    @Override // defpackage.aiui
    public Boolean e() {
        return Boolean.valueOf(this.d.b().isEmpty());
    }

    @Override // defpackage.aiui
    public jht f() {
        return this.d;
    }

    public final jht g() {
        jhu h = jhv.h();
        h.e(aitm.p(this.i, this.a, this.j, this.c, this.h));
        jhi jhiVar = (jhi) h;
        jhiVar.c = 2131231593;
        jhiVar.e = this.g.getString(R.string.OVERFLOW_MENU_ACCESSIBILITY_TEXT);
        jhiVar.c(cjtd.a(dtxu.fd));
        return jhiVar.b();
    }
}
