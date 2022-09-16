package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: oll  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oll implements Predicate {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ oll(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return predicate.getClass();
        }
        return predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Predicate.CC.$default$negate(this);
            }
            if (i == 2) {
                return Predicate.CC.$default$negate(this);
            }
            return Predicate.CC.$default$negate(this);
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return predicate.getClass();
        }
        return predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.b;
        if (i == 0) {
            return ((okw) obj).a.equals(this.a);
        } else if (i == 1) {
            return ((aucd) obj).c.equals(this.a);
        } else if (i == 2) {
            return this.a.equals(((AccountIdentity) obj).a());
        } else {
            return ((ambp) obj).c.equals(this.a);
        }
    }
}
