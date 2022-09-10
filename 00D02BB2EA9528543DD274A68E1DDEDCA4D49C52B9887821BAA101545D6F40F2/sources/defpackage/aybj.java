package defpackage;

import android.content.Context;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybj  reason: default package */
/* loaded from: classes3.dex */
public final class aybj implements Comparator<azwm<?>> {
    private final Context a;

    public aybj(Context context) {
        this.a = context;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(azwm<?> azwmVar, azwm<?> azwmVar2) {
        return azwmVar.e(this.a).compareTo(azwmVar2.e(this.a));
    }
}
