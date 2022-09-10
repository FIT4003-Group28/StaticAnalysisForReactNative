package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
import com.google.android.libraries.social.populous.core.Loggable;
/* compiled from: PG */
/* renamed from: cxrn  reason: default package */
/* loaded from: classes5.dex */
public final class cxrn {
    public int a;
    public String b;
    public int c;
    public AutocompleteMatchInfo d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public AutocompleteMatchInfo i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public String o;
    public int p;
    public String q;
    public Loggable r;

    public final PopulousChannel a() {
        dbsk.s(this.b);
        return new PopulousChannel(this);
    }

    public final void b(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final void c(String str, boolean z, boolean z2) {
        this.e = str;
        this.g = z;
        this.h = z2;
    }

    public final void d(String str, int i) {
        this.o = str;
        this.p = i;
    }
}
