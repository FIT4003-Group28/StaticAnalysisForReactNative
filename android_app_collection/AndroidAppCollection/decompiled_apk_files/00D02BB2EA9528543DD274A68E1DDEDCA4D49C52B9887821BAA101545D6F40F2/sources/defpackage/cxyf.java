package defpackage;

import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* renamed from: cxyf  reason: default package */
/* loaded from: classes5.dex */
public abstract class cxyf {
    protected abstract Person a();

    protected abstract Group b();

    protected abstract Autocompletion c();

    public abstract void d(dcdc<ContactMethodField> dcdcVar);

    protected abstract void e(int i);

    public final Autocompletion f() {
        boolean z = true;
        boolean z2 = a() != null;
        if (b() == null) {
            z = false;
        }
        dbsk.m(z2 ^ z, "Autocompletions must only contain one of: person or group.");
        if (a() != null) {
            e(2);
        } else if (b() != null) {
            e(3);
        }
        return c();
    }
}
