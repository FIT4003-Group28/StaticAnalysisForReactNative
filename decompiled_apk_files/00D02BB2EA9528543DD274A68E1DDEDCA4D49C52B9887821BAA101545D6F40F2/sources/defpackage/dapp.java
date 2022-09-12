package defpackage;
/* compiled from: PG */
/* renamed from: dapp  reason: default package */
/* loaded from: classes5.dex */
public enum dapp {
    CONFIG_DEFAULT(daos.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(daos.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(daos.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(daos.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    dapp(daos daosVar) {
        if (daosVar.V == 8) {
            return;
        }
        throw new IllegalArgumentException("Illustration progress only allow illustration resource");
    }
}
