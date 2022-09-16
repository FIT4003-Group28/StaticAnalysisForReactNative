package defpackage;
/* compiled from: PG */
/* renamed from: alxc  reason: default package */
/* loaded from: classes.dex */
public enum alxc {
    CONFIG_DEFAULT(alwe.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(alwe.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(alwe.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(alwe.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    alxc(alwe alweVar) {
        if (alweVar.bj == 8) {
            return;
        }
        throw new IllegalArgumentException("Illustration progress only allow illustration resource");
    }
}
