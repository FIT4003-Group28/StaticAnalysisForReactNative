package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
@c.d.l.a.a
/* loaded from: classes.dex */
public class BatchMountItem implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f5487a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5488b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5489c;

    public BatchMountItem(f[] fVarArr, int i, int i2) {
        if (fVarArr != null) {
            if (i >= 0 && i <= fVarArr.length) {
                this.f5487a = fVarArr;
                this.f5488b = i;
                this.f5489c = i2;
                return;
            }
            throw new IllegalArgumentException("Invalid size received by parameter size: " + i + " items.size = " + fVarArr.length);
        }
        throw new NullPointerException();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        com.facebook.systrace.a.a(0L, "FabricUIManager::mountViews - " + this.f5488b + " items");
        int i = this.f5489c;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
        for (int i2 = 0; i2 < this.f5488b; i2++) {
            this.f5487a[i2].a(bVar);
        }
        int i3 = this.f5489c;
        if (i3 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i3);
        }
        com.facebook.systrace.a.a(0L);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.f5488b) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append("BatchMountItem (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append("/");
            sb.append(this.f5488b);
            sb.append("): ");
            sb.append(this.f5487a[i]);
            i = i2;
        }
        return sb.toString();
    }
}
