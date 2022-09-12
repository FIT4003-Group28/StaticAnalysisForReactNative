package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ampv  reason: default package */
/* loaded from: classes.dex */
public class ampv {
    protected final alwy b;
    protected final int c;

    public ampv(alwy alwyVar, int i) {
        this.b = alwyVar;
        this.c = i;
    }

    public boolean equals(@dzsi Object obj) {
        ampv ampvVar;
        return (obj instanceof ampv) && (ampvVar = (ampv) obj) != null && this.b.equals(ampvVar.b) && this.c == ampvVar.c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c)});
    }
}
