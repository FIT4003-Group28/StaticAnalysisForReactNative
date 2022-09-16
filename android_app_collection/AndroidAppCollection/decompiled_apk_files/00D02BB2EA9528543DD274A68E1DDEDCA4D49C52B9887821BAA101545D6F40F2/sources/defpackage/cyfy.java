package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyfy  reason: default package */
/* loaded from: classes5.dex */
public final class cyfy implements cyfx {
    private final boolean a;
    private final boolean b;
    private final dcep<cygl> c;
    private final dcep<MatchInfo> d;
    private final dcep<MatchInfo> e;

    public cyfy(cyfx cyfxVar) {
        cyfu cyfuVar = (cyfu) cyfxVar;
        this.a = cyfuVar.a;
        this.b = cyfuVar.b;
        this.c = dcnm.b(cyfuVar.c);
        this.d = dcep.K(cyfuVar.d);
        this.e = dcep.K(cyfuVar.e);
    }

    @Override // defpackage.cyfx
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cyfx
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cyfx
    public final /* bridge */ /* synthetic */ Set c() {
        return this.c;
    }

    @Override // defpackage.cyfx
    public final boolean d() {
        return !this.d.isEmpty() || !this.e.isEmpty();
    }

    @Override // defpackage.cyfx
    public final /* bridge */ /* synthetic */ Set e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cyfx) {
            cyfx cyfxVar = (cyfx) obj;
            if (this.a == cyfxVar.a() && this.b == cyfxVar.b() && dbsd.a(this.c, cyfxVar.c()) && dbsd.a(this.d, cyfxVar.e()) && dbsd.a(this.e, cyfxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyfx
    public final /* bridge */ /* synthetic */ Set f() {
        return this.e;
    }

    @Override // defpackage.cyfx
    public final cyfu g() {
        return new cyfu(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d, this.e});
    }
}
