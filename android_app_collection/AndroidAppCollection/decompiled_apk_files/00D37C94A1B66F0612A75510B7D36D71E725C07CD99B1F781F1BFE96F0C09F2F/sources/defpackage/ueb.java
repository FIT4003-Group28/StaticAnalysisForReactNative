package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ueb  reason: default package */
/* loaded from: classes4.dex */
public abstract class ueb {
    public static uea l() {
        uea ueaVar = new uea();
        ueaVar.c = new ArrayList();
        ueaVar.g(aomr.a);
        ueaVar.d(uip.a);
        ueaVar.e(aojl.REMOVE_REASON_UNKNOWN);
        ueaVar.c(false);
        return ueaVar;
    }

    public abstract int a();

    public abstract Intent b();

    public abstract ucp c();

    public abstract uec d();

    public abstract uip e();

    public abstract aojl f();

    public abstract aols g();

    public abstract aomr h();

    public abstract String i();

    public abstract List j();

    public abstract boolean k();
}
