package com.google.android.libraries.social.populous.core;

import java.util.Comparator;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ContactMethodField implements Comparable<ContactMethodField>, Loggable, cyft, cyff {
    public static final Comparator<ContactMethodField> g = dcln.a.g(cyen.a).c();
    private static final dbrb Jk = dbrb.n('.');

    public static String l(cyfj cyfjVar, String str) {
        if (cyfjVar == cyfj.EMAIL) {
            str = str.toLowerCase(Locale.ROOT).trim();
            if (str.endsWith("@gmail.com") || str.endsWith("@googlemail.com")) {
                str = String.valueOf(Jk.h(str.substring(0, str.lastIndexOf(64)))).concat("@gmail.com");
            }
        }
        String cyfjVar2 = cyfjVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(cyfjVar2).length());
        sb.append(str);
        sb.append(",");
        sb.append(cyfjVar2);
        return sb.toString();
    }

    public abstract cyep SA();

    public abstract CharSequence a();

    public abstract PersonFieldMetadata b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ContactMethodField contactMethodField) {
        ContactMethodField contactMethodField2 = contactMethodField;
        Comparator b = dcln.a.b();
        Integer num = null;
        Integer valueOf = b() == null ? null : Integer.valueOf(b().k);
        if (contactMethodField2.b() != null) {
            num = Integer.valueOf(contactMethodField2.b().k);
        }
        return b.compare(valueOf, num);
    }

    public final Email h() {
        if (this instanceof Email) {
            return (Email) this;
        }
        return null;
    }

    public final Phone i() {
        if (this instanceof Phone) {
            return (Phone) this;
        }
        return null;
    }

    public final InAppNotificationTarget j() {
        if (this instanceof InAppNotificationTarget) {
            return (InAppNotificationTarget) this;
        }
        return null;
    }

    @Override // defpackage.cyff
    public abstract String k();
}
