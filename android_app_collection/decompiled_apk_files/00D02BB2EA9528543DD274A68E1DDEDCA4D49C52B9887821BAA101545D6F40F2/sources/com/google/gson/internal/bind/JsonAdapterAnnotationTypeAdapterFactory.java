package com.google.gson.internal.bind;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements dgtm {
    private final dguk a;

    public JsonAdapterAnnotationTypeAdapterFactory(dguk dgukVar) {
        this.a = dgukVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dgtl<?> b(dguk dgukVar, dgsx dgsxVar, dgxd<?> dgxdVar, dgtn dgtnVar) {
        dgti dgtiVar;
        dgtl<?> dgvtVar;
        Object a = dgukVar.a(dgxd.b(dgtnVar.a())).a();
        if (a instanceof dgtl) {
            dgvtVar = (dgtl) a;
        } else if (a instanceof dgtm) {
            dgvtVar = ((dgtm) a).a(dgsxVar, dgxdVar);
        } else {
            dgtb dgtbVar = null;
            if (a instanceof dgti) {
                dgtiVar = (dgti) a;
            } else if (!(a instanceof dgtb)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + dgxdVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            } else {
                dgtiVar = null;
            }
            if (a instanceof dgtb) {
                dgtbVar = (dgtb) a;
            }
            dgvtVar = new dgvt<>(dgtiVar, dgtbVar, dgsxVar, dgxdVar, null);
        }
        return (dgvtVar == null || !dgtnVar.b()) ? dgvtVar : dgvtVar.c();
    }

    @Override // defpackage.dgtm
    public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
        dgtn dgtnVar = (dgtn) dgxdVar.a.getAnnotation(dgtn.class);
        if (dgtnVar == null) {
            return null;
        }
        return (dgtl<T>) b(this.a, dgsxVar, dgxdVar, dgtnVar);
    }
}
