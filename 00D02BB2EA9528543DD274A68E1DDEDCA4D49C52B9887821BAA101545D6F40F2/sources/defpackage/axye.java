package defpackage;
/* compiled from: PG */
/* renamed from: axye  reason: default package */
/* loaded from: classes3.dex */
class axye<T> {
    private static azxb a(azwm<?> azwmVar) {
        return azxb.f(azwmVar.b(), azwmVar.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public azxb c(T t) {
        if (t instanceof azwm) {
            return a((azwm) t);
        }
        if (t instanceof azzp) {
            return a(((azzp) t).ao());
        }
        String valueOf = String.valueOf(t);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unsupported item type ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
