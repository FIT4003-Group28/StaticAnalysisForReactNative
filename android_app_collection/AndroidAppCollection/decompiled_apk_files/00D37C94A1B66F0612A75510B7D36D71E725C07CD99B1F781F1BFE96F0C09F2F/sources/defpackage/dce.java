package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: dce  reason: default package */
/* loaded from: classes3.dex */
public abstract class dce {
    private static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("_changeset");
        hashSet.add("_firstlayout");
    }

    public dce() {
        new HashSet();
        new HashSet();
    }

    public static boolean b(dce dceVar) {
        return dceVar != null && dceVar.a();
    }

    protected abstract boolean a();
}
