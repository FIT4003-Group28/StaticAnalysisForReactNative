package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cmtj  reason: default package */
/* loaded from: classes5.dex */
public final class cmtj {
    public Set<Scope> a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> i;

    public cmtj() {
        this.a = new HashSet();
        this.i = new HashMap();
    }

    public final GoogleSignInOptions a() {
        if (this.a.contains(GoogleSignInOptions.d) && this.a.contains(GoogleSignInOptions.c)) {
            this.a.remove(GoogleSignInOptions.c);
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(GoogleSignInOptions.b);
    }

    public final void c(Scope scope, Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(scopeArr));
    }

    public cmtj(GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.i = new HashMap();
        this.a = new HashSet(googleSignInOptions.g);
        this.c = googleSignInOptions.j;
        this.d = googleSignInOptions.k;
        this.e = googleSignInOptions.i;
        this.f = googleSignInOptions.l;
        this.g = googleSignInOptions.h;
        this.h = googleSignInOptions.m;
        this.i = GoogleSignInOptions.c(googleSignInOptions.n);
        this.b = googleSignInOptions.o;
    }
}
