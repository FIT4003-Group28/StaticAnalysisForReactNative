package com.google.android.libraries.social.populous;

import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Person implements Parcelable {
    private Name[] a = null;
    private Email[] b = null;
    private Phone[] c = null;
    private Photo[] d = null;
    private InAppNotificationTarget[] e = null;
    private dcdc<ContactMethodField> f;

    public static cxzx r() {
        cxxi cxxiVar = new cxxi();
        cxxiVar.h(false);
        return cxxiVar;
    }

    private final <T extends cyft> List<T> s(dcdc<T> dcdcVar) {
        if (i() && !p().isEmpty()) {
            ContactMethodField contactMethodField = p().get(0);
            for (int i = 0; i < dcdcVar.size(); i++) {
                T t = dcdcVar.get(i);
                if (contactMethodField.b().j(t.b())) {
                    ArrayList c = dchl.c(dcdcVar);
                    c.remove(i);
                    c.add(0, t);
                    return c;
                }
            }
        }
        return dcdcVar;
    }

    public abstract PersonMetadata a();

    public abstract dcdc<Name> b();

    public abstract dcdc<Email> c();

    public abstract dcdc<Phone> d();

    public abstract dcdc<Photo> e();

    public abstract dcdc<InAppNotificationTarget> f();

    @dzsi
    public abstract String g();

    @dzsi
    public abstract PersonExtendedData h();

    public abstract boolean i();

    @dzsi
    public abstract dsgo j();

    public final Name[] k() {
        if (this.a == null) {
            this.a = (Name[]) s(b()).toArray(new Name[0]);
        }
        return this.a;
    }

    public final Email[] l() {
        if (this.b == null) {
            this.b = (Email[]) c().toArray(new Email[0]);
        }
        return this.b;
    }

    public final Phone[] m() {
        if (this.c == null) {
            this.c = (Phone[]) d().toArray(new Phone[0]);
        }
        return this.c;
    }

    public final Photo[] n() {
        if (this.d == null) {
            this.d = (Photo[]) s(e()).toArray(new Photo[0]);
        }
        return this.d;
    }

    public final InAppNotificationTarget[] o() {
        if (this.e == null) {
            this.e = (InAppNotificationTarget[]) f().toArray(new InAppNotificationTarget[0]);
        }
        return this.e;
    }

    public final dcdc<ContactMethodField> p() {
        if (this.f == null) {
            dcdc<Email> c = c();
            dcdc<Phone> d = d();
            dcdc<InAppNotificationTarget> f = f();
            ArrayList arrayList = new ArrayList(c.size() + d.size() + f.size());
            arrayList.addAll(c);
            arrayList.addAll(d);
            arrayList.addAll(f);
            Collections.sort(arrayList);
            this.f = dcdc.r(arrayList);
        }
        return this.f;
    }

    public final String q() {
        return !b().isEmpty() ? b().get(0).a().toString() : "";
    }
}
