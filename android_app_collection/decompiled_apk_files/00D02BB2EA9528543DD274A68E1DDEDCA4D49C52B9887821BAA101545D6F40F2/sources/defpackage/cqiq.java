package defpackage;

import android.content.Context;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqiq  reason: default package */
/* loaded from: classes5.dex */
public final class cqiq<V extends cqkp> implements cqjb<V, String> {
    @dzsi
    public alp a;
    private final cqjb<V, ? extends String> b;
    private final cqip<V>[] c;

    @SafeVarargs
    private cqiq(cqjb<V, ? extends String> cqjbVar, cqip<V>... cqipVarArr) {
        this.b = cqjbVar;
        this.c = cqipVarArr;
    }

    @SafeVarargs
    public static <V extends cqkp> cqiq<V> b(final Integer num, cqip<V>... cqipVarArr) {
        return new cqiq<>(new cqjb(num) { // from class: cqii
            private final Integer a;

            {
                this.a = num;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return context.getString(((Integer) cqjv.a(this.a, cqkpVar, context)).intValue());
            }
        }, cqipVarArr);
    }

    @SafeVarargs
    public static <V extends cqkp> cqiq<V> c(final CharSequence charSequence, cqip<V>... cqipVarArr) {
        return new cqiq<>(new cqjb(charSequence) { // from class: cqij
            private final CharSequence a;

            {
                this.a = charSequence;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return ((CharSequence) cqjv.a(this.a, cqkpVar, context)).toString();
            }
        }, cqipVarArr);
    }

    @SafeVarargs
    public static <V extends cqkp> cqiq<V> d(final cqlc<V, ?> cqlcVar, cqip<V>... cqipVarArr) {
        return new cqiq<>(new cqjb(cqlcVar) { // from class: cqik
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                Object a = this.a.a(cqkpVar);
                if (a instanceof cqsn) {
                    return ((cqsn) a).a(context).toString();
                }
                if (a instanceof Integer) {
                    return context.getString(((Integer) a).intValue());
                }
                return a.toString();
            }
        }, cqipVarArr);
    }

    @SafeVarargs
    public static <V extends cqkp> cqiq<V> e(final Integer num, final Integer num2, cqip<V>... cqipVarArr) {
        return new cqiq<>(new cqjb(num, num2) { // from class: cqil
            private final Integer a;
            private final Integer b;

            {
                this.a = num;
                this.b = num2;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return context.getResources().getQuantityString(((Integer) cqjv.a(this.a, cqkpVar, context)).intValue(), ((Integer) cqjv.a(this.b, cqkpVar, context)).intValue());
            }
        }, cqipVarArr);
    }

    @SafeVarargs
    public static <V extends cqkp> cqiq<V> f(final int i, final cqlc<V, Integer> cqlcVar, cqip<V>... cqipVarArr) {
        return new cqiq<>(new cqjb(i, cqlcVar) { // from class: cqim
            private final int a;
            private final cqlc b;

            {
                this.a = i;
                this.b = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return context.getResources().getQuantityString(this.a, ((Integer) this.b.a(cqkpVar)).intValue());
            }
        }, cqipVarArr);
    }

    public static <V extends cqkp> cqip<V> g(@dzsi final Object obj) {
        return new cqip<>(new cqjb(obj) { // from class: cqin
            private final Object a;

            {
                this.a = obj;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return cqjv.a(this.a, cqkpVar, context);
            }
        });
    }

    public static <V extends cqkp> cqip<V> h(final cqlc<V, ?> cqlcVar) {
        return new cqip<>(new cqjb(cqlcVar) { // from class: cqio
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return this.a.a(cqkpVar);
            }
        });
    }

    @Override // defpackage.cqjb
    /* renamed from: i */
    public final String a(V v, Context context) {
        Object[] objArr = new Object[this.c.length];
        int i = 0;
        while (true) {
            cqip<V>[] cqipVarArr = this.c;
            if (i < cqipVarArr.length) {
                CharSequence a = cqipVarArr[i].a.a(v, context);
                if (a instanceof cqsn) {
                    a = ((cqsn) a).a(context);
                }
                alp alpVar = this.a;
                if (alpVar != null && (a instanceof CharSequence)) {
                    a = alpVar.c((CharSequence) a);
                }
                objArr[i] = a;
                i++;
            } else {
                return String.format(this.b.a(v, context), objArr);
            }
        }
    }
}
