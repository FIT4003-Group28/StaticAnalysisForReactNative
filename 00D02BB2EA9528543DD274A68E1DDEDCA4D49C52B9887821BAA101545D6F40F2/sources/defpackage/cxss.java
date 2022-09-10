package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
/* compiled from: PG */
/* renamed from: cxss  reason: default package */
/* loaded from: classes5.dex */
public final class cxss {
    public String a;
    public PeopleKitVisualElementPath c;
    public String d;
    public int e;
    public boolean f;
    public int j;
    public czgq b = czgq.UNKNOWN;
    public boolean g = true;
    public boolean h = true;
    public boolean i = true;

    public final PeopleKitConfigImpl a() {
        return new PeopleKitConfigImpl(this);
    }

    public final void b() {
        this.f = true;
    }

    public final void c(cxod cxodVar) {
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        this.c = peopleKitVisualElementPath;
        peopleKitVisualElementPath.b(cxodVar);
    }
}
