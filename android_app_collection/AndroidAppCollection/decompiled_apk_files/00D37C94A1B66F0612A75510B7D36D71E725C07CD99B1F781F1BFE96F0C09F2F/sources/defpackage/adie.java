package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: adie  reason: default package */
/* loaded from: classes.dex */
public abstract class adie extends adig {
    public abstract adit e();

    @Override // defpackage.adig
    public final String g() {
        return e().c;
    }

    @Override // defpackage.adig
    public boolean i(adig adigVar) {
        if (!(adigVar instanceof adie)) {
            return false;
        }
        return e().equals(e());
    }

    @Override // defpackage.adig
    public Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", e().c);
        bundle.putInt("mdx_session_type", d() - 1);
        return bundle;
    }
}
