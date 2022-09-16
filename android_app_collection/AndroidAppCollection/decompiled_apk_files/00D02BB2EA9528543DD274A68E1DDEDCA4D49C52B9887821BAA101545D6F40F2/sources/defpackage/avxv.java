package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: avxv  reason: default package */
/* loaded from: classes3.dex */
final class avxv implements Comparator<avwx> {
    private final Collator a = Collator.getInstance(Locale.getDefault());

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(avwx avwxVar, avwx avwxVar2) {
        return this.a.compare(avwxVar.p(), avwxVar2.p());
    }
}
