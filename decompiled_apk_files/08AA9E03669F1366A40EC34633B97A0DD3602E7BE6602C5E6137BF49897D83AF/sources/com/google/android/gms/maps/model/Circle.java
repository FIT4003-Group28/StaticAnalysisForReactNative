package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
/* loaded from: classes.dex */
public final class Circle {
    private final com.google.android.gms.internal.maps.zzh zzcn;

    public Circle(com.google.android.gms.internal.maps.zzh zzhVar) {
        this.zzcn = (com.google.android.gms.internal.maps.zzh) Preconditions.checkNotNull(zzhVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.zzcn.zzb(((Circle) obj).zzcn);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng getCenter() {
        try {
            return this.zzcn.getCenter();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getFillColor() {
        try {
            return this.zzcn.getFillColor();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            return this.zzcn.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final double getRadius() {
        try {
            return this.zzcn.getRadius();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getStrokeColor() {
        try {
            return this.zzcn.getStrokeColor();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zzcn.getStrokePattern());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.zzcn.getStrokeWidth();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zzcn.zzj());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.zzcn.getZIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzcn.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.zzcn.isClickable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zzcn.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.zzcn.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setCenter(LatLng latLng) {
        try {
            this.zzcn.setCenter(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.zzcn.setClickable(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setFillColor(int i) {
        try {
            this.zzcn.setFillColor(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setRadius(double d2) {
        try {
            this.zzcn.setRadius(d2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.zzcn.setStrokeColor(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        try {
            this.zzcn.setStrokePattern(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            this.zzcn.setStrokeWidth(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTag(Object obj) {
        try {
            this.zzcn.zze(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zzcn.setVisible(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zzcn.setZIndex(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
