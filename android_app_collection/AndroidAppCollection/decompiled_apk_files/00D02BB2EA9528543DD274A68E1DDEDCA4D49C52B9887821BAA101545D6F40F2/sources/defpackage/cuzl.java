package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cuzl  reason: default package */
/* loaded from: classes5.dex */
final class cuzl implements cvbq {
    final /* synthetic */ cuzo a;

    public cuzl(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // defpackage.cvbq
    public final void a() {
        cuzv cuzvVar = this.a.j;
        cuzvVar.a.b(cuzvVar.k(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu).a());
        cuzo cuzoVar = this.a;
        if (cuzoVar.Q) {
            cuzoVar.n();
        } else {
            new cuzx(cuzoVar.i, cuzoVar.b, cuzoVar.g).executeOnExecutor(cuzoVar.D, new Void[0]);
            cuzoVar.aa.d(cuzoVar.b);
            cuzoVar.x.a();
        }
        this.a.q();
    }

    @Override // defpackage.cvbq
    public final void b() {
        this.a.q();
    }
}
