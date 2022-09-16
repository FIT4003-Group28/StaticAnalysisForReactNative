package com.google.android.libraries.social.populous;

import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Autocompletion implements Parcelable {
    private ContactMethodField[] a = null;

    public static cxyf f() {
        cxxe cxxeVar = new cxxe();
        cxxeVar.d(dcdc.e());
        return cxxeVar;
    }

    public abstract dcdc<ContactMethodField> a();

    @dzsi
    public abstract Person b();

    @dzsi
    public abstract Group c();

    public abstract int d();

    public final ContactMethodField[] e() {
        if (this.a == null) {
            this.a = d() == 2 ? (ContactMethodField[]) b().p().toArray(new ContactMethodField[0]) : new ContactMethodField[0];
        }
        return this.a;
    }
}
