package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: anyh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class anyh implements aoaf {
    private final /* synthetic */ int c;
    public static final /* synthetic */ anyh b = new anyh(1);
    public static final /* synthetic */ anyh a = new anyh();

    private /* synthetic */ anyh() {
    }

    private /* synthetic */ anyh(int i) {
        this.c = i;
    }

    @Override // defpackage.aoaf
    public final Object a() {
        if (this.c != 0) {
            return Collections.emptySet();
        }
        return null;
    }
}
