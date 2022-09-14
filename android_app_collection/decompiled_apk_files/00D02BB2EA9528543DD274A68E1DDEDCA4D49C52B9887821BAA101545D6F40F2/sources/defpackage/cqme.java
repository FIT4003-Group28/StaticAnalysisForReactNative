package defpackage;
/* compiled from: PG */
/* renamed from: cqme  reason: default package */
/* loaded from: classes5.dex */
final class cqme extends RuntimeException {
    public cqme(cqmf<?> cqmfVar) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Property declaration");
        illegalArgumentException.setStackTrace(cqmfVar.d);
        String valueOf = String.valueOf(cqmfVar.toString());
        throw new RuntimeException(valueOf.length() != 0 ? "ViewPropertyBinder was unable to apply property after trying all possible appliers. This probably means you are trying to apply a property to a kind of view that doesn't support it.\n ".concat(valueOf) : new String("ViewPropertyBinder was unable to apply property after trying all possible appliers. This probably means you are trying to apply a property to a kind of view that doesn't support it.\n "), illegalArgumentException);
    }
}
