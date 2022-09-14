package com.google.ar.core;

import java.util.Collection;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
