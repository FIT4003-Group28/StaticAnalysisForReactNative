package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConnectivityRequestContainer {
    public long a;
    protected boolean b = true;

    public ConnectivityRequestContainer(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ConnectivityServiceSwigJNI.delete_ConnectivityRequestContainer(j);
            }
            this.a = 0L;
        }
    }

    public final void b(dfsc dfscVar) {
        ConnectivityServiceSwigJNI.ConnectivityRequestContainer_onCompleteOriginal(this.a, this, dfscVar == null ? null : dfscVar.bS());
    }

    protected final void finalize() {
        a();
    }
}
