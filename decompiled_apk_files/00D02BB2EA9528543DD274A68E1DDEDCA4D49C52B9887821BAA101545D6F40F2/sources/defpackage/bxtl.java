package defpackage;

import java.util.Comparator;
/* renamed from: bxtl  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bxtl implements Comparator {
    static final Comparator a = new bxtl();

    private bxtl() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((azva) obj2).q() > ((azva) obj).q() ? 1 : (((azva) obj2).q() == ((azva) obj).q() ? 0 : -1));
    }
}
