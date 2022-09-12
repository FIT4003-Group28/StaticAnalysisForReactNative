package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahdb  reason: default package */
/* loaded from: classes2.dex */
public class ahdb extends ahhf {
    private final CharSequence a;
    private final List<agwt> b;

    public ahdb(Activity activity, CharSequence charSequence, dlam dlamVar, ahhv ahhvVar, @dzsi List<jic> list, boolean z) {
        super(activity, dlamVar, ahhvVar, 4);
        this.a = charSequence;
        this.b = dcdc.e();
    }

    @Override // defpackage.agxd
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.agxd
    public List<agwt> e() {
        return this.b;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public Boolean o() {
        return true;
    }
}
