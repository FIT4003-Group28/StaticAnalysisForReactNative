package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: hwa  reason: default package */
/* loaded from: classes6.dex */
final class hwa implements Comparator<akpp> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(akpp akppVar, akpp akppVar2) {
        akpp akppVar3 = akppVar;
        akpp akppVar4 = akppVar2;
        if (akppVar3.d() < akppVar4.d()) {
            return -1;
        }
        return akppVar3.d() > akppVar4.d() ? 1 : 0;
    }
}
