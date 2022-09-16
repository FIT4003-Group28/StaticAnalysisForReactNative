package defpackage;

import defpackage.dsqr;
import defpackage.dsqs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsqr  reason: default package */
/* loaded from: classes.dex */
public class dsqr<MessageType extends dsqs<MessageType, BuilderType>, BuilderType extends dsqr<MessageType, BuilderType>> extends dsqp<MessageType, BuilderType> implements dsqt<MessageType, BuilderType> {
    /* JADX INFO: Access modifiers changed from: protected */
    public dsqr(MessageType messagetype) {
        super(messagetype);
    }

    private final dsqh<dsqu> a() {
        dsqh<dsqu> dsqhVar = ((dsqs) this.b).V;
        if (dsqhVar.b) {
            dsqh<dsqu> clone = dsqhVar.clone();
            ((dsqs) this.b).V = clone;
            return clone;
        }
        return dsqhVar;
    }

    private final void b(dsqv<MessageType, ?> dsqvVar) {
        if (dsqvVar.a == this.a) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override // defpackage.dsqp
    public final void bF() {
        super.bF();
        dsqs dsqsVar = (dsqs) this.b;
        dsqsVar.V = dsqsVar.V.clone();
    }

    @Override // defpackage.dsqp, defpackage.dssi
    /* renamed from: f */
    public final MessageType bJ() {
        if (this.c) {
            return (MessageType) this.b;
        }
        ((dsqs) this.b).V.b();
        return (MessageType) super.bJ();
    }

    @Override // defpackage.dsqt
    public final <Type> boolean g(dspy<MessageType, Type> dspyVar) {
        dsqs dsqsVar = (dsqs) this.b;
        dsqv<MessageType, ?> dsqvVar = (dsqv) dspyVar;
        dsqsVar.f(dsqvVar);
        return dsqsVar.V.k(dsqvVar.d);
    }

    public final <Type> Type h(dspy<MessageType, Type> dspyVar) {
        dsqs dsqsVar = (dsqs) this.b;
        dsqv<MessageType, ?> dsqvVar = (dsqv) dspyVar;
        dsqsVar.f(dsqvVar);
        Object l = dsqsVar.V.l(dsqvVar.d);
        if (l == null) {
            return dsqvVar.b;
        }
        return (Type) dsqvVar.b(l);
    }

    public final <Type> void i(dspy<MessageType, List<Type>> dspyVar, Type type) {
        Map<Object, dsqw<?, ?>> map = dsqw.bF;
        dsqv<MessageType, ?> dsqvVar = (dsqv) dspyVar;
        b(dsqvVar);
        if (this.c) {
            bF();
            this.c = false;
        }
        a().n(dsqvVar.d, dsqvVar.d(type));
    }

    public final void j(dspy<MessageType, ?> dspyVar) {
        Map<Object, dsqw<?, ?>> map = dsqw.bF;
        dsqv<MessageType, ?> dsqvVar = (dsqv) dspyVar;
        b(dsqvVar);
        if (this.c) {
            bF();
            this.c = false;
        }
        dsqh<dsqu> a = a();
        a.a.remove(dsqvVar.d);
        if (a.a.isEmpty()) {
            a.c = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.util.ArrayList] */
    public final <Type> void k(dspy<MessageType, Type> dspyVar, Type type) {
        Map<Object, dsqw<?, ?>> map = dsqw.bF;
        dsqv<MessageType, ?> dsqvVar = (dsqv) dspyVar;
        b(dsqvVar);
        if (this.c) {
            bF();
            this.c = false;
        }
        dsqh<dsqu> a = a();
        dsqu dsquVar = dsqvVar.d;
        if (dsquVar.d) {
            if (dsquVar.a() == dsus.ENUM) {
                ?? arrayList = new ArrayList();
                for (Object obj : (List) type) {
                    arrayList.add(dsqvVar.d(obj));
                }
                type = arrayList;
            }
        } else {
            type = (Type) dsqvVar.d(type);
        }
        a.m(dsquVar, type);
    }
}
