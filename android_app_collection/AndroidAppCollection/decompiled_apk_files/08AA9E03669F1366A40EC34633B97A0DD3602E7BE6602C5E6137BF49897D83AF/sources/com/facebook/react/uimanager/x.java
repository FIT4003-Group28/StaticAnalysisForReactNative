package com.facebook.react.uimanager;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ReactShadowNodeImpl.java */
/* loaded from: classes.dex */
public class x implements w<x> {
    private static YogaConfig sYogaConfig;
    private ArrayList<x> mChildren;
    private boolean mIsLayoutOnly;
    private ArrayList<x> mNativeChildren;
    private x mNativeParent;
    private x mParent;
    private int mReactTag;
    private x mRootNode;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private af mThemedContext;
    private String mViewClassName;
    private final YogaNode mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final ae mDefaultPadding = new ae(BitmapDescriptorFactory.HUE_RED);
    private final float[] mPadding = new float[9];
    private final boolean[] mPaddingIsPercent = new boolean[9];

    @Override // com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return false;
    }

    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.w
    public void onBeforeLayout() {
    }

    public void onCollectExtraUpdates(ao aoVar) {
    }

    @Override // com.facebook.react.uimanager.w
    public void setLocalData(Object obj) {
    }

    public x() {
        if (!isVirtual()) {
            YogaNode a2 = av.a().a();
            if (sYogaConfig == null) {
                sYogaConfig = new YogaConfig();
                sYogaConfig.a(BitmapDescriptorFactory.HUE_RED);
                sYogaConfig.a(true);
            }
            this.mYogaNode = a2 == null ? new YogaNode(sYogaConfig) : a2;
            Arrays.fill(this.mPadding, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.w
    public final String getViewClass() {
        return (String) com.facebook.j.a.a.b(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.w
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.w
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        x parent = getParent();
        if (parent == null) {
            return;
        }
        parent.markUpdated();
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.w
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.c();
        }
    }

    public final boolean isDirty() {
        return this.mYogaNode != null && this.mYogaNode.d();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.w
    public void addChildAt(x xVar, int i) {
        if (xVar.getParent() != null) {
            throw new e("Tried to add child that already has a parent! Remove it from its parent first.");
        }
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i, xVar);
        xVar.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            YogaNode yogaNode = xVar.mYogaNode;
            if (yogaNode == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + xVar.getClass().getSimpleName() + "' to a '" + getClass().getSimpleName() + "')");
            }
            this.mYogaNode.a(yogaNode, i);
        }
        markUpdated();
        int totalNativeChildren = xVar.isLayoutOnly() ? xVar.getTotalNativeChildren() : 1;
        this.mTotalNativeChildren += totalNativeChildren;
        updateNativeChildrenCountInParent(totalNativeChildren);
    }

    @Override // com.facebook.react.uimanager.w
    public x removeChildAt(int i) {
        if (this.mChildren == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        x remove = this.mChildren.remove(i);
        remove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.a(i);
        }
        markUpdated();
        int totalNativeChildren = remove.isLayoutOnly() ? remove.getTotalNativeChildren() : 1;
        this.mTotalNativeChildren -= totalNativeChildren;
        updateNativeChildrenCountInParent(-totalNativeChildren);
        return remove;
    }

    @Override // com.facebook.react.uimanager.w
    public final int getChildCount() {
        if (this.mChildren == null) {
            return 0;
        }
        return this.mChildren.size();
    }

    @Override // com.facebook.react.uimanager.w
    public final x getChildAt(int i) {
        if (this.mChildren == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        return this.mChildren.get(i);
    }

    @Override // com.facebook.react.uimanager.w
    public final int indexOf(x xVar) {
        if (this.mChildren == null) {
            return -1;
        }
        return this.mChildren.indexOf(xVar);
    }

    @Override // com.facebook.react.uimanager.w
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.a(childCount);
            }
            x childAt = getChildAt(childCount);
            childAt.mParent = null;
            childAt.dispose();
            i += childAt.isLayoutOnly() ? childAt.getTotalNativeChildren() : 1;
        }
        ((ArrayList) com.facebook.j.a.a.b(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= i;
        updateNativeChildrenCountInParent(-i);
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (this.mIsLayoutOnly) {
            for (x parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (!parent.isLayoutOnly()) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.w
    public final void updateProperties(y yVar) {
        ar.a(this, yVar);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.w
    public boolean dispatchUpdates(float f, float f2, ao aoVar, l lVar) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(aoVar);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int round = Math.round(f3);
            float f4 = f2 + layoutY;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + getLayoutWidth());
            int round4 = Math.round(f4 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (round5 != this.mScreenX || round6 != this.mScreenY || i != this.mScreenWidth || i2 != this.mScreenHeight) {
                z = true;
            }
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                lVar.b(this);
            }
            return z;
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.w
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.w
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.uimanager.w
    public final x getRootNode() {
        return (x) com.facebook.j.a.a.b(this.mRootNode);
    }

    @Override // com.facebook.react.uimanager.w
    public final void setRootNode(x xVar) {
        this.mRootNode = xVar;
    }

    @Override // com.facebook.react.uimanager.w
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.w
    public final x getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.w
    public final af getThemedContext() {
        return (af) com.facebook.j.a.a.b(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.w
    public void setThemedContext(af afVar) {
        this.mThemedContext = afVar;
    }

    @Override // com.facebook.react.uimanager.w
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    @Override // com.facebook.react.uimanager.w
    public void calculateLayout() {
        this.mYogaNode.a(Float.NaN, Float.NaN);
    }

    public final boolean hasNewLayout() {
        return this.mYogaNode != null && this.mYogaNode.b();
    }

    public final void markLayoutSeen() {
        if (this.mYogaNode != null) {
            this.mYogaNode.e();
        }
    }

    @Override // com.facebook.react.uimanager.w
    public final void addNativeChildAt(x xVar, int i) {
        com.facebook.j.a.a.a(!this.mIsLayoutOnly);
        com.facebook.j.a.a.a(!xVar.mIsLayoutOnly);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, xVar);
        xVar.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.w
    public final x removeNativeChildAt(int i) {
        com.facebook.j.a.a.b(this.mNativeChildren);
        x remove = this.mNativeChildren.remove(i);
        remove.mNativeParent = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.w
    public final void removeAllNativeChildren() {
        if (this.mNativeChildren != null) {
            for (int size = this.mNativeChildren.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.w
    public final int getNativeChildCount() {
        if (this.mNativeChildren == null) {
            return 0;
        }
        return this.mNativeChildren.size();
    }

    @Override // com.facebook.react.uimanager.w
    public final int indexOfNativeChild(x xVar) {
        com.facebook.j.a.a.b(this.mNativeChildren);
        return this.mNativeChildren.indexOf(xVar);
    }

    @Override // com.facebook.react.uimanager.w
    public final x getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.w
    public final void setIsLayoutOnly(boolean z) {
        boolean z2 = false;
        com.facebook.j.a.a.a(getParent() == null, "Must remove from no opt parent first");
        com.facebook.j.a.a.a(this.mNativeParent == null, "Must remove from native parent first");
        if (getNativeChildCount() == 0) {
            z2 = true;
        }
        com.facebook.j.a.a.a(z2, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    @Override // com.facebook.react.uimanager.w
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.w
    public boolean isDescendantOf(x xVar) {
        for (x parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == xVar) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.w
    public final int getNativeOffsetForChild(x xVar) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= getChildCount()) {
                break;
            }
            x childAt = getChildAt(i);
            if (xVar == childAt) {
                z = true;
                break;
            }
            if (childAt.isLayoutOnly()) {
                i3 = childAt.getTotalNativeChildren();
            }
            i2 += i3;
            i++;
        }
        if (!z) {
            throw new RuntimeException("Child " + xVar.getReactTag() + " was not a child of " + this.mReactTag);
        }
        return i2;
    }

    @Override // com.facebook.react.uimanager.w
    public final float getLayoutX() {
        return this.mYogaNode.k();
    }

    @Override // com.facebook.react.uimanager.w
    public final float getLayoutY() {
        return this.mYogaNode.l();
    }

    public final float getLayoutWidth() {
        return this.mYogaNode.m();
    }

    public final float getLayoutHeight() {
        return this.mYogaNode.n();
    }

    @Override // com.facebook.react.uimanager.w
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.w
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.w
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.w
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.o();
    }

    @Override // com.facebook.react.uimanager.w
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.a(yogaDirection);
    }

    public final YogaValue getStyleWidth() {
        return this.mYogaNode.g();
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleWidth(float f) {
        this.mYogaNode.f(f);
    }

    public void setStyleWidthPercent(float f) {
        this.mYogaNode.g(f);
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleWidthAuto() {
        this.mYogaNode.h();
    }

    public void setStyleMinWidth(float f) {
        this.mYogaNode.j(f);
    }

    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.k(f);
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleMaxWidth(float f) {
        this.mYogaNode.n(f);
    }

    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.o(f);
    }

    public final YogaValue getStyleHeight() {
        return this.mYogaNode.i();
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleHeight(float f) {
        this.mYogaNode.h(f);
    }

    public void setStyleHeightPercent(float f) {
        this.mYogaNode.i(f);
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleHeightAuto() {
        this.mYogaNode.j();
    }

    public void setStyleMinHeight(float f) {
        this.mYogaNode.l(f);
    }

    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.m(f);
    }

    @Override // com.facebook.react.uimanager.w
    public void setStyleMaxHeight(float f) {
        this.mYogaNode.p(f);
    }

    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.q(f);
    }

    public void setFlex(float f) {
        this.mYogaNode.a(f);
    }

    public void setFlexGrow(float f) {
        this.mYogaNode.b(f);
    }

    public void setFlexShrink(float f) {
        this.mYogaNode.c(f);
    }

    public void setFlexBasis(float f) {
        this.mYogaNode.d(f);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.f();
    }

    public void setFlexBasisPercent(float f) {
        this.mYogaNode.e(f);
    }

    public void setStyleAspectRatio(float f) {
        this.mYogaNode.r(f);
    }

    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.a(yogaFlexDirection);
    }

    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.a(yogaWrap);
    }

    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.b(yogaAlign);
    }

    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.a(yogaAlign);
    }

    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.c(yogaAlign);
    }

    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.a(yogaJustify);
    }

    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.a(yogaOverflow);
    }

    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.a(yogaDisplay);
    }

    public void setMargin(int i, float f) {
        this.mYogaNode.a(YogaEdge.a(i), f);
    }

    public void setMarginPercent(int i, float f) {
        this.mYogaNode.b(YogaEdge.a(i), f);
    }

    public void setMarginAuto(int i) {
        this.mYogaNode.a(YogaEdge.a(i));
    }

    public final float getPadding(int i) {
        return this.mYogaNode.c(YogaEdge.a(i));
    }

    public final YogaValue getStylePadding(int i) {
        return this.mYogaNode.b(YogaEdge.a(i));
    }

    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.a(i, f);
        updatePadding();
    }

    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !com.facebook.yoga.a.a(f);
        updatePadding();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updatePadding() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.mPadding
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.a.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.ae r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.c(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.a.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.a.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.a.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.ae r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.c(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.a.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.a.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.a.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.ae r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.c(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.mPaddingIsPercent
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.d(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.c(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.x.updatePadding():void");
    }

    public void setBorder(int i, float f) {
        this.mYogaNode.e(YogaEdge.a(i), f);
    }

    public void setPosition(int i, float f) {
        this.mYogaNode.f(YogaEdge.a(i), f);
    }

    public void setPositionPercent(int i, float f) {
        this.mYogaNode.g(YogaEdge.a(i), f);
    }

    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.a(yogaPositionType);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.a(yogaBaselineFunction);
    }

    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        if (((yogaMeasureFunction == null) ^ this.mYogaNode.p()) && getChildCount() != 0) {
            throw new RuntimeException("Since a node with a measure function does not add any native yoga children, it's not safe to transition to/from having a measure function unless a node has no children");
        }
        this.mYogaNode.a(yogaMeasureFunction);
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.p();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringWithIndentation(sb, 0);
        return sb.toString();
    }

    private void toStringWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("__");
        }
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (this.mYogaNode != null) {
            sb.append(getLayoutWidth());
            sb.append(",");
            sb.append(getLayoutHeight());
        } else {
            sb.append("(virtual node)");
        }
        sb.append("\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).toStringWithIndentation(sb, i + 1);
        }
    }

    @Override // com.facebook.react.uimanager.w
    public void dispose() {
        if (this.mYogaNode != null) {
            this.mYogaNode.a();
            av.a().a(this.mYogaNode);
        }
    }
}
