package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: agat  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agat implements Predicate {
    private final /* synthetic */ int k;
    public static final /* synthetic */ agat j = new agat(9);
    public static final /* synthetic */ agat i = new agat(8);
    public static final /* synthetic */ agat h = new agat(7);
    public static final /* synthetic */ agat g = new agat(6);
    public static final /* synthetic */ agat f = new agat(5);
    public static final /* synthetic */ agat e = new agat(4);
    public static final /* synthetic */ agat d = new agat(3);
    public static final /* synthetic */ agat c = new agat(2);
    public static final /* synthetic */ agat b = new agat(1);
    public static final /* synthetic */ agat a = new agat();

    private /* synthetic */ agat() {
    }

    private /* synthetic */ agat(int i2) {
        this.k = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.k) {
            case 0:
                return predicate.getClass();
            case 1:
                return predicate.getClass();
            case 2:
                return predicate.getClass();
            case 3:
                return predicate.getClass();
            case 4:
                return predicate.getClass();
            case 5:
                return predicate.getClass();
            case 6:
                return predicate.getClass();
            case 7:
                return predicate.getClass();
            case 8:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.k) {
            case 0:
                return Predicate.CC.$default$negate(this);
            case 1:
                return Predicate.CC.$default$negate(this);
            case 2:
                return Predicate.CC.$default$negate(this);
            case 3:
                return Predicate.CC.$default$negate(this);
            case 4:
                return Predicate.CC.$default$negate(this);
            case 5:
                return Predicate.CC.$default$negate(this);
            case 6:
                return Predicate.CC.$default$negate(this);
            case 7:
                return Predicate.CC.$default$negate(this);
            case 8:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.k) {
            case 0:
                return predicate.getClass();
            case 1:
                return predicate.getClass();
            case 2:
                return predicate.getClass();
            case 3:
                return predicate.getClass();
            case 4:
                return predicate.getClass();
            case 5:
                return predicate.getClass();
            case 6:
                return predicate.getClass();
            case 7:
                return predicate.getClass();
            case 8:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.k) {
            case 0:
                if ((((apgk) obj).b & 8) != 0) {
                    return true;
                }
                break;
            case 1:
                return (((apgk) obj).b & 4) != 0;
            case 2:
                return (((apgi) obj).b & 2) != 0;
            case 3:
                return (((apgi) obj).b & 1) != 0;
            case 4:
                return (((awru) obj).b & 2) != 0;
            case 5:
                return !((awru) obj).d.isEmpty();
            case 6:
                return Collection.EL.stream(((awru) obj).e).anyMatch(h);
            case 7:
                return ((awrw) obj).c != 0.0d;
            case 8:
                return !((String) obj).isEmpty();
            default:
                if ((((awsb) obj).b & 4) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
