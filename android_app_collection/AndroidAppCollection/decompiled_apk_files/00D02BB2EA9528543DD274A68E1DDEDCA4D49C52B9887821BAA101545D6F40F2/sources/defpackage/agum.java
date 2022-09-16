package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: agum  reason: default package */
/* loaded from: classes2.dex */
class agum extends agtv {
    private final CharSequence a;

    public agum(CharSequence charSequence) {
        super(charSequence, agtu.TIME_WINDOW);
        this.a = charSequence;
    }

    @Override // defpackage.agtv
    public int hashCode() {
        return Arrays.hashCode(new Object[]{agtu.TIME_WINDOW, this.a});
    }
}
