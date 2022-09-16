package defpackage;
/* compiled from: PG */
/* renamed from: axrf  reason: default package */
/* loaded from: classes2.dex */
public final class axrf implements axre {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.droidguard"));
        vbrVar.f("BugFixesFlags__enable_remove_old_programs_from_database", true);
        a = vbrVar.f("BugFixesFlags__fix_deadlock_if_asynchronous_one_step_api_times_out", true);
    }

    @Override // defpackage.axre
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
