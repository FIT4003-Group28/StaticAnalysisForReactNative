package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aodo  reason: default package */
/* loaded from: classes2.dex */
public class aodo implements aodn {
    private final aodj a;
    private final aoei b;

    public aodo(aodj aodjVar, aoei aoeiVar) {
        this.a = aodjVar;
        this.b = aoeiVar;
        g();
    }

    public static aodo d(Context context, cqat cqatVar, aogp aogpVar, boolean z, String str, Runnable runnable) {
        boolean z2 = !z;
        return new aodo(new aodj(context, cqatVar, runnable, "", dbsg.i(aogpVar.a()), z2, 524306), new aoei(context, cqatVar, runnable, str, context.getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW), aogpVar.b(), z2));
    }

    private final void g() {
        if (!e() || this.b.d().a()) {
            return;
        }
        this.a.f();
        this.b.f();
    }

    @Override // defpackage.aodn
    public aodh a() {
        return this.a;
    }

    @Override // defpackage.aodn
    public aoeg b() {
        return this.b;
    }

    @Override // defpackage.aodn
    public cqkl c() {
        boolean z = !this.b.a().booleanValue();
        this.b.g(z);
        this.a.g(z);
        g();
        return cqkl.a;
    }

    public boolean e() {
        return !this.b.a().booleanValue();
    }

    public aogp f() {
        return aogp.c(this.a.d().b(), this.b.d());
    }
}
