package defpackage;

import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: utf  reason: default package */
/* loaded from: classes4.dex */
public final class utf implements ute {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/PrimesApiImpl");
    private final uto b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;

    public utf(uto utoVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, vgt vgtVar, byte[] bArr) {
        this.b = utoVar;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.f = azqbVar4;
        this.g = azqbVar5;
        if (uwp.j() || vgtVar.a()) {
            Boolean bool = Boolean.FALSE;
            bool.getClass();
            if (bool.booleanValue()) {
                return;
            }
            ((amzw) ((amzw) a.c()).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initialize", 115, "PrimesApiImpl.java")).q("Primes instant initialization");
            try {
                WeakHashMap weakHashMap = amna.a;
                for (uvo uvoVar : (Set) azqbVar.get()) {
                    uvoVar.a();
                }
                return;
            } catch (RuntimeException e) {
                ((amzw) ((amzw) ((amzw) a.g()).h(e)).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initialize", '{', "PrimesApiImpl.java")).q("Primes failed to initialize");
                this.b.a();
                return;
            }
        }
        String str = vgtVar.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 150);
        sb.append("Primes init triggered from background in package: ");
        sb.append(str);
        sb.append(". If this is an existing error, please file a bug on the Primes team to whitelist your package name.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ute
    public final void a(uyc uycVar) {
        ((uye) this.g.get()).b(uycVar);
    }

    @Override // defpackage.ute
    public final void b() {
        ((uwf) this.d.get()).e();
    }

    @Override // defpackage.ute
    public final void c() {
        ((uxu) this.e.get()).c();
    }

    @Override // defpackage.ute
    public final void d(String str) {
        ((uxj) this.f.get()).b(str);
    }
}
