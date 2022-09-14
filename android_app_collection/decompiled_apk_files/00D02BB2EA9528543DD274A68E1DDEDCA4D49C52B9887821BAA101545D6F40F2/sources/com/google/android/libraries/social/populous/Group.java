package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.Loggable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Group implements Loggable {
    public static cxzi g() {
        return new cxxf();
    }

    public abstract String a();

    public abstract String b();

    public abstract GroupMetadata c();

    public abstract dcdc<GroupOrigin> d();

    public abstract dcdc<GroupMember> e();

    public final String f() {
        dcdc<GroupOrigin> d = d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            GroupOrigin groupOrigin = d.get(i);
            i++;
            if (groupOrigin.b() != null) {
                return groupOrigin.b().a().toString();
            }
        }
        return "";
    }
}
