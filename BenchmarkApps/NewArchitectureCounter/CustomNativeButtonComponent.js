import PropTypes from 'prop-types';
import React, { Component } from 'react';
import { requireNativeComponent, View } from 'react-native';

class CustomNativeButtonComponent extends Component {

    constructor(props) {
        super(props);
        this._onClick = this._onClick.bind(this);
    }

    _onClick(event) {
        if (!this.props.onClick) {
            return;
        }
        this.props.onClick(event.nativeEvent);
    }

    render() {
        return (
            <View style={{ flex: 0, height: 40, margin: 5 }}>
                <CustomNativeButton style={{ height: 40, width: 250 }}  {...this.props} onClick={this._onClick} />
            </View>);
    }
}

CustomNativeButtonComponent.propTypes = {
    title: PropTypes.string,
    onClick: PropTypes.func,
    ...View.propTypes,
}

const CustomNativeButton = requireNativeComponent("RTNButton", CustomNativeButtonComponent);

export default CustomNativeButtonComponent;